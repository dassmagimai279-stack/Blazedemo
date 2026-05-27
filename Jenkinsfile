pipeline {

    agent any

    tools {

        maven 'Maven'
        jdk 'Java17'
    }

    stages {

        stage('Clone GitHub') {

            steps {

                git 'https://github.com/YOUR_USERNAME/YOUR_REPOSITORY.git'
            }
        }

        stage('Build Project') {

            steps {

                bat 'mvn clean'
            }
        }

        stage('Run TestNG Tests') {

            steps {

                bat 'mvn test'
            }
        }

    }

    post {

        always {

            publishHTML(target: [
                allowMissing: false,
                alwaysLinkToLastBuild: true,
                keepAll: true,
                reportDir: 'test-output',
                reportFiles: 'index.html',
                reportName: 'TestNG Report'
            ])
        }

        success {

            echo 'Test Execution Successful'
        }

        failure {

            echo 'Test Execution Failed'
        }
    }
}
