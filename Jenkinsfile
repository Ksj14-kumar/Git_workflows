pipeline {
    agent any

    // environment {
    //     NODE_ENV = 'production'
    // }

    stages {
        stage('Checkout Code') {
            steps {
                // Pull code from the repository
                echo 'checkout code'
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
                sh 'npm run test'
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
