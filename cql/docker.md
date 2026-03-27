## Run cassandra

```bash
docker network create private
docker run --name Database --network private -d cassandra:latest
```

## Check if running

```bash
docker exec -it node1 nodetool status
```


## Connect to cqlsh

```bash
docker exec -it node1 cqlsh
```