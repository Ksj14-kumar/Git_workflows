pipeline {

 agent any
 
 environment {
    Node_ENV = "development"
    DOCKER_IMAGE = "tonysama14998/jenkins_pipeline_testing"
 }

 tools {
    nodejs "Node-23.4"
 }
 stages{
    stage("Checkout the code"){
        steps{
            echo "checkout the code"
        }
    }

    stage("Install dependencies"){
        steps {
            echo "install dependencies"
            sh "npm ci"
        }
    }

    stage("Run linter"){
        steps{
            echo "running linter..."
            sh "npm run lint"
        }
    }

    stage("Run tests"){
        steps{
            echo "run tests"
            sh "npm run test"
        }
    }

    stage("Docker login"){
        steps{
            echo "login into the docker"
            withCredentials([usernamePassword(credentialsId: 'docker-credentials-id', passwordVariable: 'password', usernameVariable: 'username')]) {
                        sh "echo $DOCKER_PASSWORD | docker login -u $DOCKER_USERNAME --password-stdin"
                    }
        }
    }
    stage("build docker image"){
        steps{
            echo "building the image..."
            sh 'docker build -t ${env.DOCKER_IMAGE}'

        }
    }

    stage("push the image"){
        steps{
            echo "pushing the docker images"
            sh 'docker push ${DOCKER_IMAGE}'
        }
    }
 }

 post{

    success{
        echo "successfull deploy docker image"
    }

    failure{
        echo "failed to build docker image"
    }

    always{
        echo "jobs failed to build docker image"
    }
    changed{
        echo "jobs changed"
    }
    aborted{
        echo "jobs aborted.."
    }
 }
}
