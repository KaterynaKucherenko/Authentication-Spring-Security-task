
pipeline {
    agent any

    tools {
        gradle 'Gradle'
    }

    environment {
    PATH = "${env.PATH};C:\\Windows\\System32"
        SONARQUBE_SCANNER_HOME = tool name: 'SonarQube Scanner', type: 'hudson.plugins.sonar.SonarRunnerInstallation'
    }

    stages {
        stage('Checkout') {
            steps {
                git url: 'https://github.com/KaterynaKucherenko/stage3-module4-task.git', branch: 'main'
            }
        }

        stage('Build') {
            steps {
                bat 'gradle clean build'
            }
        }

        stage('SonarQube Analysis') {
            steps {
                bat 'gradle sonarqube'
            }
        }

        stage('Test') {
            steps {
                bat 'gradle test jacocoTestReport'
            }
        }
    }

    post {
        always {
            echo 'Pipeline finished.'
        }
        success {
            echo 'Pipeline succeeded.'
        }

    }
}
