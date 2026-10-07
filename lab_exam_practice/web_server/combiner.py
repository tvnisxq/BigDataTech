#!/usr/bin/env python3

import sys
data = {}

for line in sys.stdin:
	key, value = line.split()
	data[key] = data.get(key, 0) + int(value)

for key in data:
	print(key, data[key])
