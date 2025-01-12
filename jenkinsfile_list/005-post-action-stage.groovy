pipeline {

agent any

    stages{

stage("stage-1"){
    steps{
        echo "this is stage-1"
    }

    post{
        always{
            echo "this is always run"
        }

        success{
            echo "this is run on success"
        }
        failure{
            echo "this is run on failure"
        }

        aborted{
            echo "this is run on pipeline aborted"
        }
        changed{
            echo "this is run on pipeline changed"
        }
    }
}
stage("stage-2"){
    steps{
        echo "this is stage-2"
    }
}
    }

    post {

        failure{
            echo "failed after 1 post stage"
        }

        success{
            echo "success after 1 post stage"
        }
        always{
            echo "always run after 1 post stage"
        }
        changed{
            echo "always run after 1 post stage"
        }
        aborted{
            echo "always run after 1 post stage aborted"
        }
    }
}