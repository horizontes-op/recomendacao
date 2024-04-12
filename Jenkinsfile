pipeline {
    agent any
    stages {
        stage('recomendacao interface') {
            steps {
                echo 'recomendacao interface'
            }
        }
        stage('build recomendacao interface') { 
            steps {
                sh 'mvn clean install'
            }
        }      
    }
}