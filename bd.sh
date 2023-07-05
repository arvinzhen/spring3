#!/bin/bash

mvnd clean compile
mvnd spring-boot:process-aot
mvnd native:compile-no-fork