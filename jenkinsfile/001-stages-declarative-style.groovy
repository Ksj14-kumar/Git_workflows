pipeline {
    agent any
    stages{
        stage("initial stage"){
            steps{
                script{ // script is added here
                echo "initial stage for jenkinsfile"
                }
            }
        }
        stage("second stage of jenkinsfile"){
            steps{
                script{ // script is added here
                echo "this is second stage"
                }
            }
        }
    }
}