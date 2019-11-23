pipeline {
   agent any

   stages {
      stage('build') {
         steps {
            sh './mvnw clean install -DskipTests'
         }
         
      }
       stage('paralelo'){
           parallel{
            stage('unitTest') {
                 steps {
                    sh './mvnw test'
                 }
                 post {
                    always {
                        junit '**/target/surefire-reports/*TEST-*.xml'
                    }
                }
              }
              stage('artifact') {
                 steps {
                    echo 'TODO: Publicar el artefacto'
                 }
              }
           }
        }
       }       
      
   post{
         success{
             archiveArtifacts artifacts: '**/target/*.war', fingerprint: true 
         }
     }
}
