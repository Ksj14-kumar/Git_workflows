pipeline {
    agent any
    environment {
        password = credentials("password")  // set in global value state
        username = credentials("username")  // set in global value username
        NODE_ENV = "dev"
        testing_token = "this is testing token"
     }

     stages{
        stage("stage-1 for access credentials"){
            steps{
                echo "this is credentials: ${env.password}"
                echo "usrname is: ${env.username}"
                echo "node env is: ${env.NODE_ENV}"
            }
        }
        stage("stage-2 for access credentials"){
            steps{
                echo "this is access token value is: ${env.testing_token}"
            }
        }
     }
}