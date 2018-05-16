// This shows a simple build wrapper example, using the AnsiColor plugin.
	
	pipeline { 
		agent any
		triggers { pollSCM('* * * * *') }
		
		stages {
			stage('Probar unitariamente') { 
				steps { 
					bat "test.bat"
				}
			}
		
			
			stage('Analisis de código') { 
				steps { 
					withSonarQubeEnv('SonarQubeLocal') {
						bat 'anali_code.bat'
					}
					
				}
			}
			
			stage('Verificar calidad técnica') { 
				steps { 
					script{					
					timeout(time: 1, unit: 'HOURS') { // Just in case something goes wrong, pipeline will be killed after a timeout
						def qg = waitForQualityGate() // Reuse taskId previously collected by withSonarQubeEnv
						if (qg.status != 'OK') {
						  error "Pipeline aborted due to quality gate failure: ${qg.status}"
						}
					}
					}
				}
			}
			
			stage('Generar desplegable') { 
				steps { 
					powershell 'wget http://localhost:6666/shutdown'
					powershell 'wget http://localhost:9999/shutdown'
					bat "build.bat"
					
				}
			}
			
			stage('Desplegar Integración') { 
				steps { 
					bat "deploy-bd.bat"
					bat "deploy-app.bat"
				}
			}

			stage('Versionar'){
				steps {
					script{
						// Obtain an Artifactory server instance, defined in Jenkins --> Manage:
						def server = Artifactory.server 'Jenkins-Local'

						def uploadSpec = """{
						  "files": [
							{
							  "pattern": "*.jar",
							  "target": "kit-basico-repository"
							}
						 ]
						}"""
						def buildInfo2=server.upload(uploadSpec)
						
						server.publishBuildInfo buildInfo2
		
					}
				}
			}
			
			stage('Desplegar Pruebas') { 
				steps { 
				
					script{	
					
				//	input "Desea desplegar a pruebas?"
					
						checkout([$class: 'GitSCM', 
						branches: [[name: '*/master']], 
						doGenerateSubmoduleConfigurations: false, 
						extensions: [[$class: 'RelativeTargetDirectory', 
							relativeTargetDir: 'KitBasicoAutomPractica-Asegurado-Ops']], 
						submoduleCfg: [], 
						userRemoteConfigs: [[url: 'https://github.com/mauro2357/KitBasicoAutomPractica-Asegurado-Ops.git']]])     
			      }
					bat 'mkdir "KitBasicoAutomApp-Asegurado/build/libs/config"'
					bat 'xcopy "KitBasicoAutomPractica-Asegurado-Ops/config" "KitBasicoAutomApp-Asegurado/build/libs/config"'
					bat 'copy  KitBasicoAutomPractica-Asegurado-Ops/config/DefaultFlywayConfig.config /DefaultFlywayConfig.config'
					bat "deploy-bd.bat"
					bat "deploy-app.bat"
				}
			}
			
		}
		
		post {
			failure {
				mail to: 'jsorrillag@gmd.com.pe;surbano@gmd.com.pe;enrique.gonzales-le@zoluxiones.com;luis.marcilla@sura.pe;carlos.linares@mdp.com.pe',
					subject: "Failed Pipeline: ${currentBuild.fullDisplayName}",
					body: "Something is wrong with ${env.BUILD_URL}"
			}
		}
		
	}

