#!/usr/bin/env python3

import sys

for line in sys.stdin:
	status = line.split()[-1]
	print(status, 1)
