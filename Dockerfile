FROM payara/server-full:5.183
COPY ./target/ ${AUTODEPLOY_DIR}
