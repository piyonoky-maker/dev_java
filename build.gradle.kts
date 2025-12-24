plugins {
    id("java")
    kotlin("jvm")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    // https://mvnrepository.com/artifact/com.oracle.database.nls/orai18n
    implementation("com.oracle.database.jdbc:ojdbc8:23.26.0.0.0")
    implementation("com.oracle.database.nls:orai18n:23.26.0.0.0")
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
    implementation(kotlin("stdlib-jdk8"))
}




tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}