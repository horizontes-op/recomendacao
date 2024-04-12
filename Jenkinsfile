pipeline {
    agent any
    stages {
        stage('Jenkins Recommendacao') {
            steps {
                echo 'Jenkins Recomendacao'
            }
        }
        stage('Build') { 
            steps {
                sh 'mvn clean install'
            }
        }      
    }
}