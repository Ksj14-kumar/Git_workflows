pipeline{

    agent any // agent is provide the envirnment for to run the pipeline

    environment {
        NODE_ENV = "development"

    }

    stages{
        stage("checkout code"){

            steps{
                echo "checkout the code repo"
            }
        }
        stage("install dependancies"){
            steps{
                echo "install dependencies"
            }
        }

        stage("run tests"){
            steps{

                echo "run tests cases"
            }
        }

        stage("run build command"){

            steps{
                echo "run build command"
            }
        }

        stage("deploy code"){
            steps{
                echo "finally deploy...🚀"
            }
        }
    }

    post{
        always{
            echo "always run this"
        }
        success{
            echo "successfully deploy"
        }

        failure{
            echo "successfull failed"
        }
    }
}