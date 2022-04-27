#!/bin/bash

cp ../target/Blog-0.0.1-SNAPSHOT.jar .

docker build -t  blog-app:1.0 .
docker-compose up -d
echo "博客启动成功"
