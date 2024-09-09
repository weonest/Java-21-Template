dependencies {
    compileOnly(project(":domain"))
    compileOnly(project(":business"))
    implementation(project(":support"))
    testImplementation(testFixtures(project(":domain")))

    // QueryDSL
    implementation("com.querydsl:querydsl-jpa:5.0.0:jakarta")
    annotationProcessor("com.querydsl:querydsl-apt:5.0.0:jakarta")
    annotationProcessor("jakarta.annotation:jakarta.annotation-api")
    annotationProcessor("jakarta.persistence:jakarta.persistence-api")

    // mysql
    runtimeOnly("com.mysql:mysql-connector-j")

    // Redis
    implementation("org.springframework.boot:spring-boot-starter-data-redis")

    // h2
    runtimeOnly("com.h2database:h2")
}
