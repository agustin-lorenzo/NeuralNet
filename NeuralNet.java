public class NeuralNet {
    
    Layer[] layers;

    public NeuralNet(int[] layerSizes) {
        layers = new Layer[layerSizes.length - 1];
        for (int i = 0; i < layers.length; i++) {
            layers[i] = new Layer(layerSizes[i], layerSizes[i + 1]);
        }
    } // NeuralNet

    double[] calculateOutputs(double[] inputs) {
        for (int i = 0; i < layers.length; i++) {
            inputs = layers[i].calculateOutputs(inputs);
        }
        return inputs;
    } // calculateOutputs

    int classify(double[] inputs) {
        double[] outputs = calculateOutputs(inputs);
         int max = 0;
         for (int i = 0; i < outputs.length; i++) {
            max = outputs[i] > outputs[max] ? i : max;
         }
         return max; 
    } // classify
}
