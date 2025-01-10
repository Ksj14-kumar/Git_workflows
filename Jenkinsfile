pipeline {
    agent any

    environment {
        NODE_ENV = 'production'
        token_id = 'this is token id'
    }


    tools {
        nodejs 'Node-23.4' // as per in jenkins configure tools envirnemnts
    }
    stages {
        stage('Checkout Code') {
            steps {
                // Pull code from the repository
                echo 'checkout code'
                echo  "the token id is: ${env.token_id}"
            }
        }

        stage('Install Dependencies') {
            steps {
                // Install dependencies
                echo 'install dependancies'
                sh 'npm ci'
            }
        }

        stage('Run Linter') {
            steps {
                // Run linting to ensure code quality
                echo 'Run linter command'
            }
        }

        stage('Run Tests') {
            steps {
                // Run unit tests
                echo 'run test command'
                sh './node_modules/.bin/jest'
            }
        }

        stage('Build Application') {
            steps {
                // Build the application (optional, depending on your app)
                echo 'build application'
            }
        }

        stage('Deploy Application') {
            steps {
                // Deploy to the target environment
                echo 'Deploy application'
                ech0 'Node env: ${env.NODE_ENV}'
                sh 'Node env on sh: ${env.NODE_ENV}'
            }
        }
    }

    post {
        always {
            echo 'Pipeline execution complete.'
        }
        success {
            echo 'Application built and deployed successfully!'
        }
        failure {
            echo 'Pipeline failed. Please check the logs.'
        }
    }
}
