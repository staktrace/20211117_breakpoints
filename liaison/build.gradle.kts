import liaison.Dependencies

buildscript {
  dependencies {
    classpath(liaison.Dependencies.kotlinGradlePlugin)
  }
}

subprojects {
  apply(plugin = "java")
  apply(plugin = "kotlin")

  dependencies {
    add("implementation", Dependencies.kotlinReflection)
    add("implementation", Dependencies.kotlinStdLibJdk8)

    add("testImplementation", Dependencies.junitApi)
    add("testRuntimeOnly", Dependencies.junitEngine)
  }

  tasks.withType<Test> {
    useJUnitPlatform()
  }
}
