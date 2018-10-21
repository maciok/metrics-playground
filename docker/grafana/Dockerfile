ARG GRAFANA_VER

# https://github.com/grafana/grafana-docker
FROM grafana/grafana:${GRAFANA_VER}

COPY config/prometheus.yaml ${GF_PATHS_PROVISIONING}/datasources/prometheus.yaml