pipeline{

    agent any // agent is provide the envirnment for to run the pipeline

    environment {
        NODE_ENV = "development"
        
    }

    stages{
        stage{

            steps{
                echo "checkout the code repo"
            }
        }
        stage{
            steps{
                echo "install dependencies"
            }
        }

        stage{
            steps{

                echo "run tests cases"
            }
        }

        stage {

            steps{
                echo "run build command"
            }
        }

        stage{
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