#COMPATIBLE_MACHINE .= "|mys-6ulx-iot"

#SUMMARY = "Add my own custom samba configuration to allow full access to disk for development only!"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

# Device tree changes
SRC_URI += "file://smb.conf"
