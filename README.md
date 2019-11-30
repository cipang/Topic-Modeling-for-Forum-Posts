# Topic-Modeling-for-Forum-Posts

use <b>rawDataConvert.ipynb</b> to process the documents exported from the MongoDB database.

use java package <b>HanLP</b> to segmentate the documents,

use <b>stopWordRemove.ipynb</b> to remove stop words.

use <b>coherence.ipynb</b> to calculate the UMass based topic coherence score. Instruction is provided in the notebook.

use <b>perplexity.ipynb</b> to calculate the perplexity. Instruction is provided in the notebook.

use <b>BTM.ipynb</b> to modeling using Biterm Topic Model.

<b>plot.ipynb</b> is also included if plot function is needed.

<b>data</b> file containing example files.

PTM and GSDMM can be modeled via the STTM package, https://github.com/qiang2100/STTM#sttm-a-library-of-short-text-topic-modeling
