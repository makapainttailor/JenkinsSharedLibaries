
def call(String stageName){

  if ("${stageName}" == "Build")
  {
    sh "mvn clean package"
  }
  else is ("${stageName}" == "SonaQube Report")
  {
    sh "mvn clean sonar:sonar"
  }
   else is ("${stageName}" == "Upload Into Nexus")
  {
    sh "mvn clean deploy"
  }
}
