# Introduction

Reverse engineered Nest API.

([see blog post for reasoning](https://blog.emilburzo.com/2020/12/reverse-engineering-nest-home-away-status-api/))

# Supported commands

## Set Home/Away status

Example:

```bash
curl -X PATCH \
  -H 'Content-Type: application/json' \
  -H 'Authorization: Basic NEST_ACCESS_TOKEN' \
  -d '{"mode":"home or away"}' \
  http://nest-rest-instance-address:8080/users/NEST_USER_ID/structures/NEST_STRUCTURE_ID
```

# Setup

## Docker

The easiest way is to run it via Docker:

```bash
docker run -d --name nest-rest -p 8080:8080 emilburzo/nest-rest:latest
```

## Credentials

### Nest access token and user id

Login to https://home.nest.com/ and then go to https://home.nest.com/session

In the JSON response you should see a `access_token` and `userid` field, like:

```json
{
  "access_token": "b.user_id.long_string",
  "userid": "user id"
}
```

### Structure id

You can just send a request with a random value for the NEST_STRUCTURE_ID:

```bash
curl -X PATCH \
  -H 'Content-Type: application/json' \
  -H 'Authorization: Basic NEST_ACCESS_TOKEN' \
  -d '{"mode":"home or away"}' \
  http://nest-rest-instance-address:8080/users/NEST_USER_ID/structures/thistotallydoesnotexist
```

And you'll get back a helpful error message which contains the structure id, e.g.:

```json
{
  "status": "FAILURE",
  "message": "User does not have permission to Set(STRUCTURE_thistotallydoesnotexist).  Allowed resources are Set(USER_XXXXXXXXXXXXXXXX, STRUCTURE_XXXXXXXXXXXXXXXX, DEVICE_XXXXXXXXXXXXXXXX)"
}
```