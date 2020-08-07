pipeline {
    agent any
   
    stages {
        stage ('Initialize') {
            steps {
                sh '''
                    echo " Build started"
                    
                '''
            }
        }

        stage ('Build') {
            steps {
                sh 'mvn -Dmaven.test.failure.ignore=true install' 
            }
            post {
                
            }
        }
    }
}
