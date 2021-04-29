@echo off
docker logout registry.cn-hangzhou.aliyuncs.com
docker login --username=请输入 --password=请输入 registry.cn-hangzhou.aliyuncs.com
echo ^>^>^>^>^>   registry-mirrors:["https://请输入.mirror.aliyuncs.com"]    ^<^<^<^<^<