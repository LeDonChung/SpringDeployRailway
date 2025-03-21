pipeline {
    agent any

    environment {
        DOCKER_IMAGE_NAME = 'spring-app'
        RAILWAY_PROJECT = 'believable-vitality'
        RAILWAY_API_KEY = credentials('railway-api-key')
    }

    stages {
        stage('Clean') {
            steps {
                script {
                    sh 'mvn clean'
                }
            }
        }

        stage('Build') {
            steps {
                script {
                    sh 'mvn compile'
                }
            }
        }

        stage('Test') {
            steps {
                script {
                    sh 'mvn test'
                }
            }
        }

        stage('Package') {
            steps {
                script {
                    sh 'mvn package'
                }
            }
        }

        stage('Deploy to Railway') {
            steps {
                script {
                    echo 'Deploying to Railway...'
                    sh """
                    railway login --apiKey $RAILWAY_API_KEY
                    railway up --project $RAILWAY_PROJECT
                    """
                }
            }
        }
    }

    post {
        always {
            cleanWs()
        }
        success {
            echo 'Pipeline completed successfully.'
        }
        failure {
            echo 'Pipeline failed.'
        }
    }
}
