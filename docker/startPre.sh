#!/bin/bash

docker build blog-app:1.0 .
docker-compose up -d
echo "博客启动成功"