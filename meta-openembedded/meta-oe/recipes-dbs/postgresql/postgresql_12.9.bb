require postgresql.inc

LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=255f15687738db8068fbe9b938c90217"

SRC_URI += "\
   file://not-check-libperl.patch \
   file://0001-Add-support-for-RISC-V.patch \
   file://0001-Improve-reproducibility.patch \
   file://remove_duplicate.patch \
   file://CVE-2022-1552.patch \
   file://CVE-2022-2625.patch \
   file://CVE-2022-41862.patch \
   file://CVE-2023-2454.patch \
   file://CVE-2023-2455.patch \
"

SRC_URI[sha256sum] = "89fda2de33ed04a98548e43f3ee5f15b882be17505d631fe0dd1a540a2b56dce"
