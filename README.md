# Build
mvn clean package && docker build -t com.asniaire/releaseinfoexposer .

# RUN

docker rm -f releaseinfoexposer || true && docker run -d -p 8080:8080 -p 4848:4848 --name releaseinfoexposer com.asniaire/releaseinfoexposer 