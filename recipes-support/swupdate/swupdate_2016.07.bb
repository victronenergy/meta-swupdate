require swupdate.inc

SRC_URI = "git://github.com/sbabic/swupdate.git;protocol=git;tag=2016.07 \
     file://defconfig \
     file://swupdate \
     "

# Since U-boot 2016-07 some fw_env functions have an additional argument, this
# adds support from them, backported from upstream. On older u-boot's this will
# pass a additional, unused argument, but it doesn't hurt on ARM (just sets r0).
#
# 2016.10 includes them, so they can be removed when adding a newer swupdate.
SRC_URI += " \
	file://0001-fix-u-boot-writing-with-libubootenv.patch \
	file://0002-suricatta-updated-to-new-U-Boot-Environment-API.patch \
	file://0003-libubootenv-fix-defunct-CONFIG_UBOOT_FWENV-option.patch \
"
