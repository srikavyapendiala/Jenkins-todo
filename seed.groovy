folder('CI-Pipelines') {
    displayName('CI Pipelines')
    description('CI Pipelines')
}

pipelineJob('CI-Pipeline/frontend-CI') {
    configure { flowdefinition ->
        flowdefinition << delegate. 'definition'(class:'org.jenkinsci.plugins.workflow.cps.CpsScmFlowDefinition',plugin:'workflow-cps') {
            'scm'(class:'hudson.plugin.git.GitSCM',plugin:'git') {
                'userRemoteConfigs' {
                    'hudson.plugin.git.UserRemoteConfig' {
                        'url'('https://github.com/srikavyapendiala/frontend.git')
                    }
                }
                'branches' {
                    'hudson.plugin.git.BranchSpec' {
                        'name'('*/main')
                    }
                }
            }
            'scriptPath'('Jenkinsfile')
            'lightweight'(true)
        }
    }
}

