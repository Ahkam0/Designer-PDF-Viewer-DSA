function designerPdfViewer(h, word) {
    // Write your code here

    let max = 0;
    let wL = word.length

    const alphabetDict = {};
    for (let i = 0; i < 26; i++) {
        alphabetDict[String.fromCharCode(97 + i)] = i;
    }
    for (let index = 0; index < wL; index++) {
        let ch = word[index]

        if (h[alphabetDict[ch]] > max) {
            max = h[alphabetDict[ch]]
        }

    }
    return max * wL
}
