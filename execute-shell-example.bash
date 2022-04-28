echo off
df -kh
echo Workspace: $WORKSPACE
ls -lsa $WORKSPACE
echo $HOME
ls -lsa $HOME
cd $WORKSPACE/path/to/wherever
JAVA_HOME=/opt/some/path/java11
