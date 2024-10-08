allow_scm_jenkinsfile = true
skip_default_checkout = false

keywords {
    override    = true
    master      =  /^[Mm]aster$/
    devops      =  /^devops/
    develop     =  /^[Dd]evelop(ment|er|)$/
    test        =  /^[Tt]est(ing|)$/
}

libraries {
  sdp {}
  
  git {
    github
  }

debug {}

}
  
