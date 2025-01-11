pipeline {

    agent any

    // tool {
    //     nodejs "Node-23.4"
    // }

    stages{

        stage("outside parallel stage"){
            steps{
                echo "this is outside pipeline stage"
            }
        }

        stage("parallel stage is start from here"){
            parallel{

                stage("nested stage start from here...."){


                stages{

                    stage("Nestsed stage-1")
                    {
                        steps{
                        echo "this is nested stage-1"
                        }
                    }

                    stage("Nested stage-2"){
                        steps{
                            echo "this is nested stage-2"
                        }
                    }
                }
                }

                stage("outside nested stage"){
                    steps{
                        echo "this is outside nested stage-1"
                    }
                }

                stage("outside nested stage-2"){
                    steps{
                        echo "this is outside nested stage-2"
                    }
                }
            }
        }
    }
}




// pipeline {

//     stages{

//         stage("") {...}

//         stage("") {...}

//         stage(""){

//             parallel{
//                 stage(""){...}
//                 stage("nested sateg"){
//                     stages{
//                         stage(""){....}
//                         stage("") {....}
//                     }
//                 }
//                 stage(""){....}
//             }
//         }
//     }
// }