pipeline{
    agent any

    stages{
        stage("stage-1"){
            steps{
                echo "first stage"
            }
        }

        stage("parallel stage is start from here"){
            parallel{
                stage("parallel stage-1"){
                    steps{
                        echo "this is parallel stage-1"
                    }
                }

                stage("parallel stage-2"){
                    steps{
                        echo "this is parallel stage-2"
                    }
                }
            }
        }
    }
}