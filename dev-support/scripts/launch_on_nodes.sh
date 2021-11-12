#!/usr/bin/env bash

export NODES=[]
export USER=
export DIRECTORY=

# Copy jar files to nodes
for node in NODES:
    scp coordinator/ ${USER}@${node}:${DIRECTORY}
end

# Launch jar on nodes

