require swupdate.inc

SRC_URI = "git://github.com/sbabic/swupdate.git;protocol=git;tag=2016.07 \
     file://defconfig \
     file://swupdate \
     "

SRC_URI_append_raspberrypi2 += " \
	file://0001-fix-u-boot-writing-with-libubootenv.patch \
	file://0002-suricatta-updated-to-new-U-Boot-Environment-API.patch \
	file://0003-libubootenv-fix-defunct-CONFIG_UBOOT_FWENV-option.patch \
"
