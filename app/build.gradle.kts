group = "hm.verysmart"
version = "0.1"
description = "Решение 2го тестового задания."

plugins {
    java
    kotlin("jvm") version "1.3.72"
    application
}

repositories {
    jcenter()
}

dependencies {
    implementation(platform("org.jetbrains.kotlin:kotlin-bom"))
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
//    implementation("com.google.guava:guava:29.0-jre")

//    testImplementation("org.jetbrains.kotlin:kotlin-test")
//    testImplementation("org.jetbrains.kotlin:kotlin-test-junit")
}

application {
    mainClassName = "hm.verysmart.test_task_20.AppKt"
}