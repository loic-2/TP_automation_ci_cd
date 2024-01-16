pipeline {
    agent any
    
    stages {
        stage('Build') {
            steps {
                // Add your build steps here
                sh 'mvn clean install'
            }
        }
        
        stage('Test') {
            steps {
                // Add your test steps here
                sh 'mvn test'
            }
        }
        
        stage('Deploy') {
            steps {
                // Add your deployment steps here
                sh 'mvn deploy'
            }
        }
    }
}
