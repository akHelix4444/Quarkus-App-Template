# Howto startup docker-compose configs

## Startup commands

- Start config from file `<compose-file>`: `docker-compose --file <compose-file> up --build [--detach]`
  > `--detach` - detach output from current terminal.
- Stop config from file `<compose-file>`: `docker-compose --file <compose-file> down [--volumes]`
  > `--volumes` - remove named containers volumes.

## Compose builds

- `monitoring` - set up pair of Prometheus and Grafana;
- `postgresql` - set up PostgreSQL (Sakila database inited) with pgAdmin UI;
- `s3` - set up MinIO S3 Object Storage.
