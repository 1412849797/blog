#!/bin/bash
echo "启动数据库"
docker-compose up -d
echo "启动博客====>"
java -jar ./Blog-0.0.1-SNAPSHOT.jar
echo "博客启动成功"
