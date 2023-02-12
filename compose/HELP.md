# Howto startup docker-compose configs

## Startup commands

- Start config from file `<compose-file>`: `docker-compose --file <compose-file> up --build [--detach]`
  > `--detach` - detach output from current terminal.
- Stop config from file `<compose-file>`: `docker-compose --file <compose-file> down [--volumes]`
  > `--volumes` - remove named containers volumes.
