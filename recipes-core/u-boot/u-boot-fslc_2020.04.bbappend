COMPATIBLE_MACHINE .= "|mys-6ulx-iot"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI += "file://0001-setup-correct-boot-partitions.patch"
