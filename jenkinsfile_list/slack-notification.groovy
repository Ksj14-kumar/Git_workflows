
pipeline {

    agent any

    stages{

        stage("Slack testing."){
            steps{
                echo "this is slack testing send message"
                slackSend message: "this is message send via jenkins pipeline on the job"
                slackUserIdFromEmail 'abc@gmail.com'
            }

            post{

                failure{
                    echo "the pipeline is failed on the run jobs"
                }
                success{
                    echo "the pipeline is success full run the job"
                }

                changed{
                    echo "the pipeline is successfull changed"
                }
                aborted{
                    echo "the pipeline is successfull aborted"
                }
            }
        }
        // stage("Branch Name"){
        //     steps{
        //         echo "this is branch name"
        //         slackSend message: "the branch name is: ${BRANCH_NAME}"
        //     }
        // }
        // stage("changed Id"){
        //     steps{
        //         echo "the changed id is: ${CHANGE_ID}"
        //     }
        // }
        // stage("CHANGE_URL"){
        //     steps{
        //         echo "the change url is: ${CHANGE_URL}"
        //         slackSend message: "the change url is: ${CHANGE_URL}"
        //     }
        // }
        stage("BUILD_NUMBER"){
            steps{
                echo "the build number is: ${BUILD_NUMBER}"
                slackSend message: "the cbuild_number is: ${BUILD_NUMBER}"
            }
        }
        stage("BUILD_ID"){
            steps{
                echo "the build id is: ${BUILD_ID}"
                slackSend message: "the BUILD_ID is: ${BUILD_ID}"
            }
        }
        stage("JOB_NAME"){
            steps{
                echo "the Job_name is: ${JOB_NAME}"
                slackSend message: "the BUILD_ID is: ${JOB_NAME}"
            }
        }
        stage("NODE_NAME"){
            steps{
                echo "the node_name is: ${NODE_NAME}"
                slackSend message: "the node_name is: ${NODE_NAME}"
            }
        }

        stage("JENKINS_URL"){
            steps{
                echo "the node_name is: ${JENKINS_URL}"
                slackSend message: "the JENKINS_URL is: ${JENKINS_URL}"
            }
        }
                stage("BUILD_URL"){
            steps{
                echo "the node_name is: ${BUILD_URL}"
                slackSend message: "the BUILD_URL is: ${BUILD_URL}"
            }
        }
    }

    post {

        failure{
            echo "pipeline is failed due to some error"

            slackSend message: "pipeline is failed on the URL: ${BUILD_URL}"
            slackSend message: "the JENKINS_URL is: ${JENKINS_URL}"
        }
    }
}