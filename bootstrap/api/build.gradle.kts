tasks.getByName("bootJar") {
    enabled = true
}

tasks.getByName("jar") {
    enabled = false
}

dependencies {
    // module
    implementation(project(":business"))
    implementation(project(":domain"))
    implementation(project(":infrastructure"))
    implementation(project(":support"))

    // Spring
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-validation")
}
