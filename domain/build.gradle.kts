dependencies {
    implementation(project(":support"))

    // jpa
    api("org.springframework.boot:spring-boot-starter-data-jpa")
    // ULID Creator
    api("com.github.f4b6a3:ulid-creator:5.2.3")
//    // JWT
//    implementation("io.jsonwebtoken:jjwt-api:0.12.3")
//    runtimeOnly("io.jsonwebtoken:jjwt-impl:0.12.3")
//    runtimeOnly("io.jsonwebtoken:jjwt-jackson:0.12.3")
//
//    // JSON
//    implementation("org.json:json:20230618")

    // Test Fixture
    api("org.instancio:instancio-junit:4.8.0")
}
