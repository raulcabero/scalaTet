lazy val root = (project in file(".")).
  settings(
    groovy.settings,
    testGroovy.settings,
    libraryDependencies += "org.codehaus.groovy" % "groovy-all" % "2.1.8",
    libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % "test",
    libraryDependencies += "org.spockframework" % "spock-core" % "0.7-groovy-2.0",
    libraryDependencies += "org.hamcrest" % "hamcrest-core" % "1.2",

    libraryDependencies += "cglib" % "cglib-nodep" % "2.2",        
    libraryDependencies += "org.objenesis" % "objenesis" % "1.2",        
    libraryDependencies += "org.codehaus.groovy.modules.http-builder" % "http-builder" % "0.7",
    libraryDependencies += "org.gebish" % "geb-spock" % "0.13.1",        
    definedTests in Test := GroovyTest.groovyTests.value
  )



